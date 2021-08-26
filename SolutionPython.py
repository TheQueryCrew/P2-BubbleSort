def bubbleSort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]


arr = [2, 1, 6, 4, 9, 7, 5]

bubbleSort(arr)

p = []
for i in range(len(arr)):
    p.append(arr[i])

print("arr = ", p)
