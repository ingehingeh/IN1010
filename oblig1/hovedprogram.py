"""
5. Hovedprogram
Lag et Datasenter som leser inn informasjon om regneklyngene
saga og abel fra testfiler som beskrevet ovenfor.

For hver av regneklyngene skal du deretter skrive ut:
navnet på regneklyngen, antall racks, antall prosessorer og
hvor mange noder som har minst 32 GB, 64 GB og 128 GB minne.

Utskriften kan f.eks. se slik ut:
Informasjon om regneklyngen Saga
Antall rack: 56
Antall prosessorer: 682
Noder med minst 32 GB: 666
Noder med minst 64 GB: 666
Noder med minst 128 GB: 16
"""
from datasenter import Datasenter
from regneklynge import Regneklynge
from rack import Rack
from node import Node

abelFilnavn = "abel.txt"
sagaFilnavn = "saga.txt"
abel = abelFilnavn.replace(".txt", "")
saga = sagaFilnavn.replace(".txt", "")

datasenter11 = Datasenter()

datasenter11.lesInnRegneklynge(abelFilnavn, 12)
datasenter11.lesInnRegneklynge(sagaFilnavn, 12)

print("\nInformasjon om regneklyngen: abel")
print("Antall rack:", datasenter11._datasenter[abel].antRacks())
print("Antall prosessorer:", datasenter11._datasenter[abel].antProsessorer())
print("Noder med minst 32 GB: ", datasenter11._datasenter[abel].noderMedNokMinne(32))
print("Noder med minst 64GB: ", datasenter11._datasenter[abel].noderMedNokMinne(64))
print("Noder med minst 128 GB: ", datasenter11._datasenter[abel].noderMedNokMinne(128))

print("\nInformasjon om regneklyngen: saga")
print("Antall rack:", datasenter11._datasenter[saga].antRacks())
print("Antall prosessorer:", datasenter11._datasenter[saga].antProsessorer())
print("Noder med minst 32 GB: ", datasenter11._datasenter[saga].noderMedNokMinne(32))
print("Noder med minst 64GB: ", datasenter11._datasenter[saga].noderMedNokMinne(64))
print("Noder med minst 128 GB: ", datasenter11._datasenter[saga].noderMedNokMinne(128))
