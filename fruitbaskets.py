#Use backtrack to find the sums of subsets, which is smaller than 200
def backTrack(nums, subsetSize, idx, total):
    #since every weight is between 50 and 1000, subset with size greater than 4 
    #must has total sum greater than 200, so this cases can be ignored
    if idx == len(nums) or subsetSize == 4:
        if total < 200:
            return total
        return 0#This is the case when total is greater than 200
    #initialize the result by backTracking at nums
    #This case is when next element is included in the subset, total should add that element
    result = backTrack(nums, subsetSize+1, idx+1, total+nums[idx])
    #This case is when next element isn't included in the subset, keep backtracking
    #by recursively call itself
    result += backTrack(nums, subsetSize, idx+1, total)
    return result

    

n = int(input())
s = input().split()
inputNums = []
#read inputs to a list
for i in range(n):
    inputNums.append(int(s[i]))
#find the sum of all subsets with sum less than 200
small = backTrack(inputNums, 0, 0, 0)
#The total sum of all subsets can be described by sum(nums) multiplied by 2^(n-1)
result = sum(inputNums)*(2**(n-1))
#total sum subtracted by small is the result we want
result = result - small
print(result)
