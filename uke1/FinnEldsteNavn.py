# Uke 1: Foreles 3; Lese fra fil (Python eksempel)

fil = open("alder.txt", "r")
eldste_navn = "ingen"
maks_alder = 0
linje = fil.readline()
while linje != "":
    biter = linje.split()
    navn = biter[0]
    alder = int(biter[1])
    if alder > maks_alder:
        eldste_navn = navn
        maks_alder = alder
    linje = fil.readline()

print(eldste_navn)
fil.close()