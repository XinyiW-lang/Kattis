# -*- coding: utf-8 -*-
"""
Created on Sat Oct 24 12:18:29 2020

@author: DELL
"""

lines = int(input());
return_string = ""
for i in range(lines):
    line = input();
    if line[0:11] == "Simon says ":
        return_string = return_string + line[11:]+'\n'

print(return_string)