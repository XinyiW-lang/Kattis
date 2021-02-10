# -*- coding: utf-8 -*-
"""
Created on Wed Nov 18 14:01:55 2020

@author: DELL
"""
def possible(graph, money, num_p):
    not_visited = list(range(num_p))

    #single component, should be 0
    for v in range(num_p):
        if graph[v] == []:
            if money[v] != 0:
                return False
            continue

        component_sum = 0
        #Use list to implement stack
        s = [v]
        while len(s) > 0:
            cur_v = s.pop()

            if cur_v not in not_visited:
                continue

            not_visited.remove(cur_v)
            component_sum += money[cur_v]

            for friend in graph[cur_v]:
                if friend in not_visited:
                    s.append(friend)

        if component_sum != 0:
            return False

    return True

###############################################################################
line1 = input().split()
num_people = int(line1[0])
num_relation = int(line1[1])
money = []
for i in range(num_people):
    money.append(int(input()))
    
#print("Money: ", money)
#Use dictionary to represent graph
people = {new_list: [] for new_list in range(num_people)} 

#print("People: ", str(people))
#Add edges
for i in range(num_relation):
    r = input().split()
    p1 = int(r[0])
    p2 = int(r[1])
    people[p1].append(p2)
    people[p2].append(p1)

if (possible(people,money, num_people)):
    print("POSSIBLE")
else:
    print("IMPOSSIBLE")
