import re

with open('cmudict.0.7.b.txt', 'r') as cmuf:
    cmu = cmuf.read().splitlines()

cljmap = ''
for i in range(0, len(cmu)):
    if cmu[i][:3] != ';;;':
        split = cmu[i].replace('"', '\\"').split('  ')
        word = split[0]
        phonems = "'(" + " ".join(map(lambda x: ':' + x, split[1].split(' '))) + ')'

        # Checking if second
        if '(' in word and ')' in word:
            # Adding to precendent
            cljmap = cljmap[:-4]
            cljmap = cljmap + ' %s]\n  ' % phonems
            pass
        else:
            # Appending
            cljmap += ' "%s" [%s]\n  ' % (word, phonems)

cljmap = '{%s}' % cljmap


with open('results.txt', 'w') as rf:
    rf.write(cljmap)
