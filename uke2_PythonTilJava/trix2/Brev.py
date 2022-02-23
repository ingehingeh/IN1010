class Brev:
    def __init__(self, avsender, mottaker):
        self._avsender = avsender
        self._mottaker = mottaker
        self._linjer = []

    def skrivLinje(self, linje):
        self._linjer.append(linje)

    def lesBrev(self):
        print("Hei,", self._mottaker)
        print()
        for linje in self._linjer:
            print(linje)
        print()
        print("Hilsen fra,")
        print(self._avsender)

brevet = Brev("Per Askeladd", "Espen Askeladd")
brevet.skrivLinje("Hvordan har du det?")
brevet.skrivLinje("Jeg har det bare bra!")
brevet.lesBrev()
