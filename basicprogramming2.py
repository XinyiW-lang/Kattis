# -*- coding: utf-8 -*-
"""
Created on Sat Nov 14 14:51:19 2020

@author: DELL
"""
from collections import Counter

def t1(n,a):
    for i in range(1,7777):
        if i in a and 7777-i in a:
            return "Yes"
    return "No"

def t2(n,a):
    #avoid duplicate
    s = set(a)
    if (len(s) == n):
        print("Unique")
    else:
        print("Contains duplicate")

def t3(n,a):
    i,j = Counter(a).most_common(1)[0]
    if j > n/2:
        print(i)
    else:
        print(-1)

def t4(n,a):
    s = sorted(a)
    if len(s)%2 == 1:
        print(s[len(s)//2])
    else:
        res = str(s[len(s)//2 - 1]) + " " + str(s[len(s)//2])
        print(res)
        

def t5(n,a):
    res = []
    for i in a:
        if (100 <= i <= 999):
            res.append(i)
    res = sorted(res)
    print(*res, sep = " ")

nt = input().split()
arr = input().split()
n = int(nt[0])
t = int(nt[1])
a = []
for c in arr:
    a.append(int(c))
if t == 1:
    print(t1(n,a))
if t == 2:
    t2(n,a)
if t == 3:
    t3(n,a)
if t == 4:
    t4(n,a)
if t == 5:
    t5(n,a)
