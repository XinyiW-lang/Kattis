# -*- coding: utf-8 -*-
"""
Created on Sat Dec  5 13:51:51 2020

@author: DELL
"""

counter = 0
factor = 2
n = int(input())
while (factor*factor <= n):
    if (n % factor == 0):
        n = n/factor
        counter += 1
    else:
        factor += 1

print(counter+1)