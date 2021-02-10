# -*- coding: utf-8 -*-
"""
Created on Fri Nov 27 17:13:34 2020

@author: DELL
"""
import math

def distance(x,y):
    result = round(math.sqrt(x**2 + y**2))
    return result

#print(distance(3,5))
pi = math.pi
cases = int(input())
for i in range(cases):
    x,y = 0,0
    angle = 0
    command_num = int(input())
    for j in range(command_num):
        cmd_line = input().split()
        command = cmd_line[0]
        digit = int(cmd_line[1])
        if(command == "lt"):
            angle += digit
        if (command == "rt"):
            angle -= digit
        if (command == "fd"):
            x += digit * math.sin(angle*(pi/180))
            y += digit * math.cos(angle *(pi/180))
        if (command == "bk"):
            x -= digit * math.sin(angle*(pi/180))
            y -= digit * math.cos(angle *(pi/180))
    result = distance(x,y)
    print(result)