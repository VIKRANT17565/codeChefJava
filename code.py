def median_fun(arr):
    n = len(arr)
    if(n%2 == 1):
        return arr[int(n/2)]
    return (arr[int(n/2)]+arr[int(n/2)-1])/2


t = int(input())
for i in range(t):
    n = int(input())
    m = int(input())
    arr = list(map(int, input().split()))
    arr.sort()