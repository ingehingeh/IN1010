from rack import Rack

## Klasse for representasjon av regneklynge i et datasenter.
#
class Regneklynge:
    ## Oppretter en regneklynge og setter maks antall noder
    # det er plass til i et rack
    # @param noderPerRack max antall noder per rack
    def __init__(self, noderPerRack):
        self._noderPerRack = noderPerRack
        self._regneklynge = []

    ## Plasserer et node-objekt inn i et rack med ledig plass, eller i et nytt
    # @param node referanse til noden som skal settes inn i datastrukturen
    def settInnNode(self, node):

        # Om ingen racks i regneklynge = Legg til rack
        if len(self._regneklynge) == 0:
            self._regneklynge.append(Rack(self._noderPerRack))

        # Om siste rack er fullt = Legg til nytt rack
        lastRack = self._regneklynge[-1]
        if lastRack.getAntNoder() == self._noderPerRack:
            self._regneklynge.append(Rack(self._noderPerRack))

        # Sjekk om det er plass i rack og fyller, ellers går til neste rack, osv
        for rack in self._regneklynge:
            if rack.getAntNoder() < self._noderPerRack:
                rack.settInn(node)

    ## Beregner totalt antall prosessorer i hele regneklyngen
    # @return totalt antall prosessorer
    def antProsessorer(self):
        regneklyngeProsessorer = 0
        for rack in self._regneklynge:
            regneklyngeProsessorer += rack.antProsessorer()
        return regneklyngeProsessorer

    ## Beregner antall noder i regneklyngen med minne over angitt grense
    # @param paakrevdMinne hvor mye minne skal noder som telles med ha
    # @return antall noder med tilstrekkelig minne
    def noderMedNokMinne(self, paakrevdMinne):
        antNoder = 0
        for rack in self._regneklynge:
            antNoder += rack.noderMedNokMinne(paakrevdMinne)
        return antNoder

    ## Henter antall racks i regneklyngen
    # @return antall racks
    def antRacks(self):
        Racks = len(self._regneklynge)
        return Racks


# rack11.settInn(node11)
# regneklynge11.settInnNode(node11)
# # Oppretter et regneklynge-objekt
# regneklynge11 = Regneklynge(noderPerRack)
