#cipher

print(''.join([(chr(219-ord(x)) if  x.isalpha() else x) for x in input()]))

#pangrams

print('Yes' if len(set([x for x in input() if x.isalpha()])) == 26 else 'No')
