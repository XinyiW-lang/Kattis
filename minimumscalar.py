# -*- coding: utf-8 -*-
"""
Created on Sat Oct 17 22:58:13 2020

@author: Xinyi Wang
"""
def find_min_scalar(v1, v2, len):
    v1 = list(reversed(sorted(v1)))
    v2 = sorted(v2)
    res = 0
    for i in range(len):
        res += v1[i] * v2[i]
    return res

cases = int(input())
return_str = ""
for i in range(cases):
    v1=[]
    v2=[]
    len = int(input())
    in1 = input().split()
    in2 = input().split()
    for j in range(len):
        v1.append(int(in1[j]))
        v2.append(int(in2[j]))
    return_str = return_str+ "Case #" + str(i+1) + ": " + str(find_min_scalar(v1,v2, len)) + "\n"
    
print(return_str)