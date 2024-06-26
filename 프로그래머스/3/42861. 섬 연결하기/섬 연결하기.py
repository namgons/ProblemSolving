def union(parents, x, y):
    x = find(parents, x)
    y = find(parents, y)

    if x < y:
        parents[y] = x
    elif y < x:
        parents[x] = y

    return x != y


def find(parents, x):
    if parents[x] == x:
        return x

    return find(parents, parents[x])


def solution(n, costs):
    costs.sort(key=lambda x: x[2])

    answer = 0

    parents = list(range(n))
    count = 0
    for a, b, c in costs:
        if count == n - 1:
            break
            
        if union(parents, a, b):
            count += 1
            answer += c

    return answer