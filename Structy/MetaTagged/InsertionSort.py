def insertion(arr):
    for i in range(1, len(arr)):
        j = i - 1
        key = arr[i]

        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
        return arr

#Complexity:
#Time - O(N) Average and O(N^2) worst case
#Space - O(1)