def pm(start, end):
    print(start, '->', end)

def hanoi( n, start, end):
    if n==1:
        pm(start,end)
    else:
        other = 6 - (start + end)
        hanoi((n - 1), start, other)
        pm(start, end)
        hanoi(n - 1, other, end)

n = input()
hanoi(n, 1, 3)