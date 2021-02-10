from collections import deque

#Use undirected graph, find the shortest path from the element in Horror List
class undirected_graph:
    def __init__(self, num_of_v):
        #Initialize the vertices list
        self.adj = []
        for i in range(num_of_v):
            self.adj.append([])
        #create list and initialized to [0,1,2, ... , num_of_v-1]
        self.not_visited = list(range(num_of_v))
        self.q = deque()

    def add_edge(self, v, u):
        self.adj[v].append(u)
        self.adj[u].append(v)

    def add_source(self, v):
        self.not_visited.remove(v)
        self.q.append((0,v))
###############################################################################
#BFS for the graph to find highest HI with lowest ID
def bfs(g):
    horror_idx,current_id = -1,-1
    while g.q:#True if not empty
        #(cost, id)
        cost, v = g.q.popleft()
        #Update horror_idx to get max horror_idx with lowest current_id
        if cost > horror_idx or (cost == horror_idx and v < current_id):
            horror_idx,current_id = cost, v
        for u in g.adj[v]:
            if u in g.not_visited:
                g.not_visited.remove(u)
                g.q.append((cost+1,u))
    #if not_visited is empty, return the current idex, 
    #since there is no vertice with INF Horror Index, current_id contains 
    #the highest HL with lowest ID
    if not g.not_visited:
        return current_id
    else:
        #Elements in not_visited have the INF Horror Idx, should return min(ID)
        return min(g.not_visited)
###############################################################################
first_line = input().split()
num_of_v=int(first_line[0])
num_of_edge = int(first_line[2])
l_of_HM = input().split()
#create graph and initialize
g=undirected_graph(num_of_v)
for h in l_of_HM:
    g.add_source(int(h))
for i in range(num_of_edge):
    relation = input().split()
    g.add_edge(int(relation[0]),int(relation[1]))
result = bfs(g)
print(result)
