"""
Lag en regneklynge, abel, og la det være plass til 12 noder i hvert rack.
Legg inn 650 noder med 64 GB minne og en prosessor hver.
Legg også inn 16 noder med 1024 GB minne og to prosessorer.
Sjekk hvor mange noder som har minst 32 GB, 64 GB og 128 GB minne.
Finn totalt antall prosessorer, og sjekk hvor mange rack som brukes.

Skriv ut svarene i terminalen.
Utskriften kan f.eks. se slik ut:
Noder med minst 32 GB: 666
Noder med minst 64 GB: 666
Noder med minst 128 GB: 16
Antall prosessorer: 682
Antall rack: 56
"""
from regneklynge import Regneklynge
from rack import Rack
from node import Node

abel = Regneklynge(12)

for i in range(0,650):         ### Obs endre 20 til 650 ###
    abel.settInnNode(Node(64, 1))

for i in range(0,16):
    abel.settInnNode(Node(1024, 2))

print("Antall prosessorer:", abel.antProsessorer())
print("Antall prosessorer:", abel.antProsessorer())
print("Noder med minst 32 GB: ", abel.noderMedNokMinne(32))
print("Noder med minst 64GB: ", abel.noderMedNokMinne(64))
print("Noder med minst 128 GB: ", abel.noderMedNokMinne(128))
