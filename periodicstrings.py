# -*- coding: utf-8 -*-
"""
Created on Fri Nov 13 00:16:13 2020

@author: DELL
"""
#Doing separate stirng to n length(k) substrings
from textwrap import wrap

def find_k(n,s):
    if(s.count(s[0]) == n):
        return 1;
    for i in range(2,n):
        wrapped = wrap(s,i)
        if (n % i == 0):#The condition that need to check every substring
            indicator = True
            for j in range(0,n//i - 1):
                # every substring should do rotation (wrapped[j][-1] + wrapped[j][:-1])
                #with last char of previous substirng moved to first
                if wrapped[j+1] != wrapped[j][-1] + wrapped[j][:-1]:
                    indicator = False
                    break
            if indicator:
                return i
    return n

s=input()
print(find_k(len(s),s))