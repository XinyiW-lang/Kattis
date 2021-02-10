# -*- coding: utf-8 -*-
"""
Created on Sat Oct 24 13:49:13 2020

@author: DELL
"""
        
def intersect(target_inter, inter_to_compare):
    return any((
        target_inter[0] <= inter_to_compare[0] < target_inter[1],
        target_inter[0] < inter_to_compare[1] <= target_inter[1],
        inter_to_compare[0] < target_inter[0] and inter_to_compare[1] > target_inter[1]
    ))



while True:
    n,m = map(int,input().split())
    if n == m == 0:
        break
    #get all the inters
    inters = []
    for i in range(n):
        start_dur = [*map(int,input().split()[2:])]
        a = start_dur[0]
        b = a+start_dur[1]
        modified = [a,b]
        inters.append(modified)
    for j in range(m):
        target_inter = [*map(int,input().split())]
        target_inter = [target_inter[0], target_inter[0]+target_inter[1]]
        print(sum(intersect(target_inter, i) for i in inters))
