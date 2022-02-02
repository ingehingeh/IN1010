from node import Node

## Klasse for representasjon av racks i en regneklynge.
#
class Rack:
    ## oppretter et rack der det senere kan plasseres noder
    def __init__(self, maksNoder):
        self._rack = []
        self._maksNoder = maksNoder

    ## Henter antall noder i racket
    # @return antall noder
    def getAntNoder(self):
        antNoder = len(self._rack)
        return antNoder

    ## Plasserer en ny node inn i racket
    #  @param node noden som skal plasseres inn
    def settInn(self, node):
        if self.getAntNoder() < self._maksNoder:
            self._rack.append(node)

    ## Beregner sammenlagt antall prosessorer i nodene i et rack
    # @return antall prosessorer
    def antProsessorer(self):
        rackProssesorer = 0
        for node in self._rack:
            rackProssesorer += node.antProsessorer()
        return rackProssesorer

    ## Beregner antall noder i racket med minne over gitt grense
    # @param paakrevdMinne antall GB minne som kreves
    # @return antall noder med tilstrekkelig minne
    def noderMedNokMinne(self, paakrevdMinne):
        antNoder = 0
        for node in self._rack:
            if node.nokMinne(paakrevdMinne):
                antNoder += 1
        return antNoder


# rack11.settInn(node11)
# rack11.getAntNoder()
# rack11.noderMedNokMinne(5)
# Opprett rack-objekt
# rack11 = Rack()
