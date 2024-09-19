def func(s):
    res = set()  
    helper("", s, res)
    return list(res)  

def helper(curr, remaining, res):
    if not remaining:
        res.add(curr) 
    else:
        for i in range(len(remaining)):
            helper(curr + remaining[i], remaining[:i] + remaining[i+1:], res)

# Example usage
s = "abc"
res = func(s)
print(res)
