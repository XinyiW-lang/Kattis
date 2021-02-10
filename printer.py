# -*- coding: utf-8 -*-
"""
Created on Sat Oct 24 12:37:18 2020

@author: DELL
"""

print_job = int(input())
printer = 1
days = 0
while printer < print_job:
    printer = printer*2
    days+= 1
        
days+=1
print(days)

