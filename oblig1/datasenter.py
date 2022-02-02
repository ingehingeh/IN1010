from regneklynge import Regneklynge
from rack import Rack
from node import Node

## Klasse for representasjon av et datasenter
#
class Datasenter:
    ## Oppretter et datasenter
    #
    def __init__(self):
        self._datasenter = {} # Ordbok med regneklynger: abel, saga, osv

    ## Leser inn data om en regneklynge fra fil og legger
    # den til i ordboken
    # @param filnavn filene der dataene for regneklyngen ligger
    def lesInnRegneklynge(self, filnavn, noderPerRack):

        # fjerner filtype-endelsen
        # F.eks: "abel.txt" -> "abel"
        klyngenavn = filnavn.replace(".txt", "")

        # Leser inn regneklynge fra .txt fil
        fil = open(filnavn, "r")
        linjer = []
        for linje in fil:
            linje = linje.strip()
            linjer.append(linje)

        # Max noder per rack i regneklynge
        maxNoderPrRack = int(linjer[0])

        # Type 1 node spesifikasjon
        node1 = linjer[1].split(" ")
        node1Ant = int(node1[0])
        node1Minne = int(node1[1])
        node1AntPros = int(node1[2])

        # Type 2 node spesifikasjon
        noder2 = linjer[2].split(" ")
        node2Ant = int(noder2[0])
        node2Minne = int(noder2[1])
        node2AntPros = int(noder2[2])

        # Oppretter tom regneklynge
        self._datasenter[klyngenavn] = Regneklynge(noderPerRack) # abel = regneklynge-objekt

        # Setter inn noder med Type 1 spesifikasjon
        for i in range(0, node1Ant): # Gjenta for 650 noder
            self._datasenter[klyngenavn].settInnNode(Node(node1Minne, node1AntPros))

        # Setter inn noder med Type 2 spesifikasjon
        for i in range(0, node2Ant): # Gjenta for 16 noder
            self._datasenter[klyngenavn].settInnNode(Node(node2Minne, node2AntPros))

    ## Skriver ut alle regneklyngenes
    def skrivUtAlleRegneklynger(self):
        for regneklynge in self._datasenter:
            print(regneklynge)

    ## Skriver ut informasjon om en spesifikk regeklynge
    # @param navn navnet på regnekyngen
    def skrivUtRegneklynge(self, navn):
        for regneklynge in self._datasenter.keys():
            if regneklynge == navn:
                print(regneklynge)
