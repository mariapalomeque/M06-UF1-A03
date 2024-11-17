# M06-UF1-A03

## Arxiu Encarrec.java i Article.java
En la carpeta Model trobem dos classes anomenades Encarrec i Article.

### Classe Encarrec
En la classe Encarrec ttrobem uns els seus atributs:
  id: Identificador únic de l'encàrrec.
  nomCli: Nom del client que ha fet l'encàrrec.
  telCli: Telèfon del client.
  dataEncarrec: Data en què s'ha realitzat l'encàrrec.
  articles: Llista d'objectes Article associats a l'encàrrec.
  PreuTotal: Preu total de l'encàrrec.
Tot seguit te els seus Constructors, Getters, Setters i toStrings.

Aquesta classe permet gestionar la informació d'un encàrrec per l'emmagatzematge i processament de dades en altres parts del projecte.

### Classe Article
En la classe Article trobem una classe molt similar ala de Encarrec on trobem els sesus atributs:

  nomArticle: Nom de l'article.
  nombreUnitats: Quantitat de l'article.
  tipusUnitat: Tipus d'unitat (per exemple, "kg", "u", "l").
  preuUnitat: Preu per unitat de l'article.
  Tot seguit te els seus Constructors, Getters, Setters, toCSV i toStrings ames a mes de uns metodes de comprovació per exemple perque el nom del atricle no sigui null etc.

Aqueta classe es molt similar a la de Encarrec, fa lo mateix amés amés de les validacions que fa.

## Arxiu Aplicacio.java

Aquet arxiu es molt llarg i es on es gestiona tot el programa.

Per començar trobem el metode **main** on executa el programa i mostra un menu amb opcions.

El seguent metode es el **mainMenu** que mostra(en text osea print) las opcions que hi ha al menu principal de la app: Afegir nous encàrrecs, Mostrar encàrrecs existents, Modificar encàrrecs i Sortir del programa.

El seguent metode es **DemanarOpcio** i aquet si que crida els metodes de afegir, mostrar, modificar i tencar, amb ifs fent comprovacions i amb els switch case. Ames de crear algunes varibles i arrays.

El següent mètode és **AfegirDadesEncarrec** i aquest s'encarrega de permetre a l'usuari introduir la informació necessària per crear un nou encàrrec. Demana dades del client com el nom, el telèfon i la data de l'encàrrec. També gestiona la llista d'articles utilitzant la classe GestioArticle que s'encarrega d'afegir els articles associats a l'encàrrec

El mètode **EscriureFitxers** s'encarrega de guardar les dades d'encàrrecs en diferents formats de fitxer segons l'elecció de l'usuari, comença demanant l'usuari que indiqui quin tipus de format vol utilitzar per desar el fitxer, amb opcions com text, CSV, binari, accés aleatori, serialitzat o XML. Tot seguit es defineix un nom de fitxer a partir d'una ruta predefinida i l'horari actual utilitzant System.currentTimeMillis() per garantir que cada fitxer tingui un nom únic. Després, segons la resposta de l'usuari, el mètode utilitza la classe UtilWriteFitxer per cridar el mètode corresponent per escriure les dades en el format triat.

El mètode **MostrarEncarrec** permet obrir i llegir fitxers de encàrrecs en diferents formats. Primer es pregunta al usuari quin tipus de fitxer vol obrir (CSV, binari, aleatori, serialitzat o XML). Després, es demana el nom del fitxer que vol obrir, assegurantque està a la carpeta indicada. Un cop obtingudes les opcions, es crida al mètode corresponent de la classe UtilReadFitxer per llegir el fitxer segons el tipus seleccionat. El mètode utilitza un switch per gestionar cada opció i realitzar la lectura corresponent.

## Arxiu UtilReadFixer.java

El mètode **UtilReadFitxer** gestiona la lectura de fitxers d'encàrrecs en diferents formats (CSV, binari, aleatori, serialitzat i XML). Depenent del tipus de fitxer seleccionat, l'usuari pot llegir els encarrecs i els articles associats. Els fitxers CSV es processen línia per línia, els binaris es llegeixen amb DataInputStream, i els fitxers aleatoris es gestionen amb RandomAccessFile. Els fitxers serialitzats es deserialitzen amb un ObjectInputStream i els fitxers XML es llegeixen utilitzant l'API DOM per processar les etiquetes. Finalment, es mostren els detalls dels encarrecs amb el mètode FormatEncarrec.

## Arxiu UtilWriteFixer.java

Aqui nomes explicare la part del dom ja que sino no sexplica correctament el que sa treballat en aquet exercici
La funció **EscripturaDOM** crea un fitxer XML amb la info dels encarrecs. Primer es crea un DocumentBuilderFactory per crear el document XML. Després s'afegeixen els elements principals com encarrec, nomCli, telCli, dataEncarrec i preuTotal. Per cada encarrec es crea una etiqueta encarrec amb els seus atributs i després s'afegeixen més elements dins com els articles que porta l'encarrec. La funció CrearElement afegeix les etiquetes amb els seus valors dins el document XML. Quan ja està tot afegit, es genera el fitxer XML amb el nom basat en l'horari actual i es desa al disc. Al final el sistema imprimeix que el fitxer s'ha generat, i si hi ha algun error, el captura i ho mostra.





