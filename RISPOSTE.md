```
Rispondere negli spazi indicati
```

Markdown tutorial: [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

1. ... risposta ...
Si tratta della conversione dei dati da un formato leggibile in un formato codificato che può essere letto o elaborato solo dopo che è stato decrittato. Solo la persona autorizzata può decriptare i dati e accedere alle informazioni nel formato originale. Ci sono un sacco di metodi per criptare e decriptare i dati, ma la chiave del successo non sta nell’algoritmo. La cosa più importante è mantenere segreta la chiave crittografica (password), o meglio fare in modo che la conoscano solo le persone autorizzate.

La crittografia è la base della protezione dei dati ed è il modo più semplice e importante per garantire che le informazioni di un sistema informatico non possano essere rubate e lette da qualcuno che voglia utilizzarle per scopi malevoli.
```
Fonti:
https://www.dgroove.it/cose-la-crittografia-e-perche-e-importante-per-la-protezione-dei-dati-in-azienda/4515/
```

2. 

... risposta ...
Nella crittografia simmetrica, la chiave, definita privata o segreta, è univoca sia in fase di cifratura che di decifratura. Per accedere ad un contenuto protetto con questa tecnica è necessario quindi che avvenga lo scambio della chiave tra i due soggetti. Questo sistema risulta efficiente, veloce e comodo per la trasmissione di dati in blocco, ma la necessità di scambiarsi la chiave lo rende vulnerabile.

Esistono invece tecniche che sfruttano la crittografia asimmetrica: questo approccio prevede che la cifratura iniziale avvenga tramite una chiave pubblica (o circolante) appartenente al destinatario, che sarà in grado di decifrare il contenuto esclusivamente attraverso un’ulteriore chiave, in questo caso privata. Questa tecnica è stata concepita per eludere i rischi connessi alla trasmissione delle chiavi, in quanto quella pubblica che circola non è sufficiente per decriptare il contenuto protetto.

La crittografia asimmetrica è il sistema utilizzato sia nella firma digitale, strumento atto a dare validità legale ad un documento, sia nelle chat online (cosiddetta crittografia End-to-End) come ad esempio su Whatsapp. L’applicazione della crittografia asimmetrica ha tuttavia lo svantaggio di richiedere una capacità computazionale relativamente elevata
```
Fonti:
https://blog.osservatori.net/it_it/crittografia-cosa-si-intende-e-quali-sono-le-principali-applicazioni
```

3. 

... risposta ...
La firma digitale è uno strumento che permette ai cittadini, ai professionisti ed alle imprese di firmare dei documenti facendoli diventare documenti con valore legale, ed è il risultato di un procedimento informatico che si basa sui concetti di:

– autenticità, per assicurare e garantire chi è che ha firmato il documento si è assunto anche la responsabilità del suo contenuto,
– integrità, condizione che serve a dimostrare dal momento in cui è stato firmato fino al momento in cui è utilizzato esso non è mai stato modificato,
– non ripudio in quanto chi ha firmato il documento mediante la firma elettronica non può poi disconoscerlo.

Per ottenere questo risultato la firma elettronica si basa sull’utilizzo di strumenti crittografici. Quindi nel sistema della firma digitale ciascun titolare ha assegnate una coppia di chiavi (due numeri binari di lunghezza pari, allo stato dell’arte, almeno a 2048 bit).
L’assegnazione è a carico di un soggetto istituzionalmente qualificato (il certificatore) – in Italia dall’Agenzia per l’Italia Digitale – che emette a favore del titolare un certificato digitale che associa il numero binario di 2048 bit alla sua identità. Questo identifica in modo certo il richiedente le credenziali di sottoscrizione.

Contemporaneamente a questa chiave, detta pubblica perché nota a tutti gli interessati, viene generata un’altra chiave di pari lunghezza che è privata ed a controllo esclusivo del titolare. La chiave è installata in un ambiente sicuro (nella smart card il microchip) e può essere utilizzata solamente tramite una password di sblocco che è nota come PIN.
```
Fonti:
https://www.agendadigitale.eu/documenti/firma-digitale-cose-come-funziona-e-come-ottenerla/
```

4. 

... risposta ...
Poiché gli algoritmi a chiave asimmetrica come RSA possono essere violati usando la fattorizzazione dei numeri interi mentre gli algoritmi a chiave simmetrica come AES non sono soggetti a questo tipo di problematica, le chiavi RSA devono essere molto più lunghe per raggiungere lo stesso livello di sicurezza offerto dagli algoritmi a chiave simmetrica.

Il National Institute of Standards and Technology (NIST) raccomanda una dimensione minima della chiave di 2048 bit ma è utile usare chiavi a 4096 bit in quelle situazioni in cui i dati devono essere protetti da aggressori che possono potenzialmente disporre di risorse computazionali di primissimo livello.

L’utilizzo della fattorizzazione è soltanto uno dei modi con cui i dati protetti con RSA possono essere eventualmente violati. Altre tipologie di attacco hanno infatti il potenziale per per rompere la crittografia con una minore quantità di risorse impegnate ma il loro successo dipende dall’implementazione e da altri fattori, non necessariamente da RSA stesso. Citiamone alcuni:

– Generazione pseudo casuale dei numeri. Alcune implementazioni di RSA usano generatori di numeri primi pseudocasuali che risultano “deboli”. Se i numeri primi non sono sufficientemente casuali è molto più facile per gli attaccanti fattorizzarli e rompere la crittografia. Il generatore di numeri pseudocasuali deve essere quindi crittograficamente sicuro.

– Generazione imperfetta delle chiavi. Le chiavi RSA devono rientrare in certi parametri per essere considerabili come sicure. Se i primi P e Q sono troppo vicini tra loro la chiave può essere facilmente scoperta.
Allo stesso modo il numero D che costituisce parte della chiave privata non può essere troppo piccolo. Un valore basso lo rende facilmente individuabile.
Di un caso simile avevamo parlato a suo tempo indicando come addirittura una chiave RSA-1024 potesse essere trovata con una configurazione AWS (Amazon Web Services) in appena 45 minuti di tempo e con 75 dollari di investimento a causa della generazione superficiale dei numeri primi.

– Attacchi side channel. Gli attacchi side channel non rompono direttamente la cifratura RSA ma invece usano informazioni relative all’implementazione per dare agli attaccanti suggerimenti sul processo seguito.
Interagendo con i meccanismi di branch prediction a livello di CPU o misurando il tempo di esecuzione delle istruzioni in alcuni casi è possibile risalire alla chiave privata.
Utilizzando un timing attack un aggressore può misurare il tempo di decodifica per un certo numero di messaggi crittografati e anche in questo caso esporre la chiave privata (l’attacco si può contrastare usando alcune accortezze ad esempio la tecnica RSA blinding).

La buona notizia è che RSA può essere considerato sicuro nonostante tutti i possibili attacchi dei quali abbiamo parlato. Soprattutto se ci si orienta almeno sull’utilizzo dell’algoritmo RSA-2048 consigliato da tutte le realtà industriali.
L’importante è che l’algoritmo RSA sia implementato correttamente con una chiave che soddisfa i requisiti.

```
Fonti:
https://www.ilsoftware.it/focus/quanto-e-davvero-sicuro-un-algoritmo-crittografico-il-caso-di-rsa_23332/
```

5. 

... risposta ...
a crittografia post-quantistica ( PQC ), a volte definita a prova quantistica , sicura quantistica o resistente ai quanti , è lo sviluppo di algoritmi crittografici (solitamente algoritmi a chiave pubblica ) che si ritiene siano sicuri contro un attacco crittoanalitico da parte di un computer quantistico . Il problema con gli algoritmi più diffusi attualmente utilizzati sul mercato è che la loro sicurezza si basa su uno dei tre difficili problemi matematici: il problema della fattorizzazione degli interi , il problema del logaritmo discreto o il problema del logaritmo discreto della curva ellittica . Tutti questi problemi potrebbero essere facilmente risolti su un computer quantistico sufficientemente potente che esegua l' algoritmo di Shor [1] [2] o anche su alternative più veloci e meno impegnative (in termini di numero di qubit richiesti). [3]

Mentre a partire dal 2023 i computer quantistici non avranno la potenza di elaborazione necessaria per violare gli algoritmi crittografici ampiamente utilizzati, [4] i crittografi stanno progettando nuovi algoritmi per prepararsi al Q-Day , il giorno in cui gli attuali algoritmi saranno vulnerabili agli attacchi del calcolo quantistico. Il loro lavoro ha attirato l'attenzione del mondo accademico e dell'industria attraverso la serie di conferenze PQCrypto ospitate dal 2006, diversi workshop sulla crittografia sicura quantistica ospitati dall'ETSI ( European Telecommunications Standards Institute ) e dall'Institute for Quantum Computing . [5] [6] [7] La ​​presunta esistenza di diffusi programmi di raccolta adesso e di decriptazione successiva è stata vista anche come una motivazione per l'introduzione anticipata di algoritmi post-quantistici, poiché i dati registrati ora potrebbero rimanere sensibili anche per molti anni nel futuro. . [8] [9] [10]

In contrasto con la minaccia che l’informatica quantistica rappresenta per gli attuali algoritmi a chiave pubblica, la maggior parte degli algoritmi crittografici simmetrici e delle funzioni hash attuali sono considerati relativamente sicuri contro gli attacchi dei computer quantistici. [2] [11] Sebbene l'algoritmo quantistico di Grover velocizzi gli attacchi contro i codici simmetrici, raddoppiando la dimensione della chiave è possibile bloccare efficacemente questi attacchi. [12] Pertanto la crittografia simmetrica post-quantistica non ha bisogno di differire in modo significativo dall'attuale crittografia simmetrica.

```
Fonti:
https://en.wikipedia.org/wiki/Post-quantum_cryptography
```

6. 

... risposta ...
La crittografia omomorfica, detta anche omomorfa, deve il suo nome a un’applicazione matematica detta omomorfismo algebrico. La tecnica è stata teorizzata nel 2009 dall’informatico americano Craig Gentry, ed è una forma di crittografia che consente l’analisi dei dati senza accesso alla chiave segreta di criptazione.
La potenzialità di questo sistema è che le deduzioni raggiunte sulla base dei calcoli eseguiti sui dati criptati debbano essere accurate come se fossero utilizzati i dati in chiaro. Il poter utilizzare dati cifrati al posto di quelli già decriptati è una soluzione potente: rende possibile analizzare e manipolare dati senza che vengano rivelati a chi non è autorizzato.
A garantire la coerenza tra i due risultati, quello ottenuto con dati decifrati e con quello con dati ancora crittografati, è proprio il concetto matematico di omomorfismo: questa proprietà implica che le procedure, sia coi dati in chiaro che criptati, diano dei risultati “conformi”, cioè simili.
In questo modo chiunque può eseguire elaborazioni sui dati cifrati, ma i dati in chiaro restano segreti e possono essere utilizzati e conosciuti solo da chi possiede la chiave crittografica.

A cosa può servire la crittografia omomorfica? Con la crescita del cloud computing, poter utilizzare la crittografia omomorfica implica avere accesso a una grandissima quantità di dati, utilizzabili soprattutto a fini statistici ma senza doverli per questo trattare “in chiaro”, aumentando così la sicurezza generale e salvaguardando la privacy dei singoli utenti.
Questo sistema crittografico trova la sua naturale applicazione in tutti quei settori altamente regolamentati, come ad esempio nel caso della sanità digitale, dove è più forte l’esigenza di un trattamento dei dati sensibili che sia il più sicuro possibile e in grado di eseguire calcoli senza ridurre i livelli di privacy dei soggetti.
Per fare un esempio pratico, sarebbe possibile mantenere criptati tutti i dati sensibili non indispensabili dei pazienti (nome, cognome, domicilio, numero di telefono, ecc.), ed effettuare calcoli sui soli dati utili ai fini dello studio, come quelli per ottenere statistiche sull’incidenza delle malattie nella popolazione o per valutare l’efficacia dei vari farmaci.
La crittografia omomorfa, però, potrà trovare applicazione in moltissimi altri settori in futuro, come ad esempio la mappatura dei flussi di persone in un centro commerciale o lo studio del traffico automobilistico in una città, e potrà riscrivere le dinamiche del trattamento dei dati personali e anche le relative regole di protezione, rendendo obsolete alcune normative come il GDPR e il problema del trasferimento all’estero dei dati sensibili.

```
Fonti:
https://www.fastweb.it/fastweb-plus/digital-magazine/crittografia-omomorfica-cose-e-perche-e-importante-per-la-privacy/
```

7. 

... risposta ...
Le Zero-Knowledge Proof sono una famiglia di tecnologie crittografiche che permettono di dimostrare la veridicità di un’affermazione senza dover rivelare le informazioni che la riguardano. Per esempio, con le ZKP è possibile dimostrare a qualcuno di conoscere la soluzione di un complesso schema di sudoku, senza svelare nulla della soluzione stessa.
Le ZKP sono alla base di una delle principali soluzioni di scalabilità Layer 2, i cosiddetti rollup, sviluppati con l’obiettivo di aumentare il volume (throughput) e la velocità delle transazioni su blockchain e circoscrivere così sia la congestione della rete che i costi di transazioni troppo elevati.

Le Zero-Knowledge Proof sono una famiglia di tecnologie crittografiche che permettono di dimostrare la veridicità di un’affermazione senza dover rivelare le informazioni che la riguardano. Per esempio, con le ZKP è possibile dimostrare a qualcuno di conoscere la soluzione di un complesso schema di sudoku, senza svelare nulla della soluzione stessa.
Le ZKP sono alla base di una delle principali soluzioni di scalabilità Layer 2, i cosiddetti rollup, sviluppati con l’obiettivo di aumentare il volume (throughput) e la velocità delle transazioni su blockchain e circoscrivere così sia la congestione della rete che i costi di transazioni troppo elevati.
Perfetto, dirai, questa è la possibilità formalizzata concettualmente…
Ma in concreto come funziona?
Partiamo dagli attori chiamati ad interagire.
In un sistema ZKP, il “prover” ha la possibilità di dimostrare al “verifier” che conosce una determinata informazione, che viene chiamata “witness”, senza dover rivelare l’informazione stessa, cioè senza dover necessariamente condividere con il verifier dati riservati e sensibili.
Questo meccanismo permette di garantire al sistema un elevato standard di sicurezza e di privacy.
```
Fonti:
https://knobs.it/zero-knowledge-proof-zkp-cosa-sono-e-perche-sono-cosi-importanti/
```

8. 

... risposta ...
Grazie alla tecnica crittografica end-to-end (spesso abbreviata in "etee", acronimo dell'inglese "end-to-end encryption"), gli utenti coinvolti nello scambio comunicativo avranno la certezza che, anche in caso di attacco ai server dell'azienda che eroga il servizio (come, ad esempio, WhatsApp o Telegram, nel caso di una sessione di messaggistica istantanea), i loro pacchetti dati saranno al sicuro da occhi indiscreti. La crittografia end-to-end, infatti, dà modo di crittografare i pacchetti in modo che solo i due nodi comunicanti (quello emittente e quello ricevente) siano in grado di decriptare – e quindi decifrare – i messaggi inviati attraverso la Rete. In altre parole, le chiavi crittografiche sono presenti direttamente nei computer (o negli smartphone o altro device) che inviano e ricevono ai messaggi, mentre i server della società agiscono come semplici postini, incapaci di leggere (decifrare) i messaggi in transito.
Affinché ciò sia possibile, è necessario adottare un sistema di crittografia che prevede l'utilizzo di due chiavi crittografiche: una pubblica e l'altra privata. Un software installato sul dispositivo – sia esso un computer, uno smartphone o altro – si occuperà di generare la coppia di chiavi: la prima, detta chiave privata, resterà sul dispositivo dell'utente e servirà per decifrare i pacchetti dati ricevuti nel corso dello scambio; la seconda, detta chiave pubblica, sarà condivisa con l'altro utente con cui si scambiano i messaggi e sarà utilizzata da quest'ultimo per crittografare tutti pacchetti dati indirizzati a noi. La chiave pubblica, inoltre, è progettata in modo che i messaggi crittografati possano essere decifrati solo da chi possiede la relativa chiave privata: un sistema end-to-end (traducibile con "da punto a punto" o "da nodo a nodo") nel quale sono necessarie entrambe le chiavi per spedire e ricevere messaggi "comprensibili".

 Purtroppo, nemmeno la crittografia end-to-end è completamente al riparo da attacchi hacker che utilizzino tecniche di ingegneria sociale ("social engineering" in inglese): è ancora possibile, infatti, ingannare l'utente e riuscire ad entrare in possesso delle chiavi crittografiche end-to-end fingendosi uno dei destinatari del messaggio. In tal modo il social hacker può avviare uno scambio di pacchetti – sotto forma di messaggi, ad esempio – e mettere in atto tecniche di spoofing per riuscire a decifrare il contenuto dei pacchetti e la chiave crittografica che le accompagna. Una volta ottenuta la chiave, l'hacker sarà in grado di decifrare i pacchetti inviati anche ad altri nodi esattamente come fosse uno dei destinatari "leciti" dei messaggi stessi.

```
Fonti:
https://www.fastweb.it/fastweb-plus/digital-magazine/crittografia-end-to-end-che-cos-e-e-come-funziona/
```

9. 

... risposta ...
La Tecnologia blockchain produce una struttura di dati con qualità intrinseche di sicurezza. Si basa su principi di crittografia, decentralizzazione e consenso, che garantiscono l'attendibilità delle transazioni. Nella maggior parte delle blockchain o delle tecnologie con ledger registro distribuito (distributed ledger technologies, DLT), i dati sono strutturati in blocchi e ogni blocco contiene una transazione o un insieme di transazioni. Ogni nuovo blocco si collega a tutti i blocchi precedenti in una catena crittografica in modo da renderne praticamente impossibile la manomissione. Tutte le transazioni all'interno dei blocchi sono convalidate e concordate tramite un meccanismo di consenso, garantendo che ogni transazione sia effettiva e corretta.
La tecnologia blockchain consente il decentramento attraverso la partecipazione dei membri ad una rete distribuita. Non esiste un singolo punto di errore e un singolo utente non può modificare il record delle transazioni. Tuttavia, le diverse tecnologie blockchain differiscono per alcuni aspetti critici della sicurezza.

Le reti blockchain possono differire nel ruolo di chi può partecipare e chi ha accesso ai dati. Le reti sono in genere etichettate come pubbliche o private, per evidenziare chi è autorizzato a partecipare, e con autorizzazione o senza autorizzazione, per evidenziare come i partecipanti ottengono l'accesso alla rete.

Blockchain pubbliche e private
Le reti blockchain pubbliche in genere consentono a chiunque di aderire e ai partecipanti di rimanere anonimi. Una blockchain pubblica utilizza computer connessi a Internet per convalidare le transazioni e ottenere il consenso. Bitcoin è probabilmente l'esempio più noto di blockchain pubblica e raggiunge il consenso attraverso il "mining di bitcoin". I computer sulla rete bitcoin, o "minatori", cercano di risolvere un problema crittografico complesso per creare proof of work e quindi convalidare la transazione. Al di fuori delle chiavi pubbliche, ci sono pochi controlli di identità e di accesso in questo tipo di rete.

Le blockchain private utilizzano l'identità per confermare l'appartenenza e i privilegi di accesso e in genere consentono l'adesione solo alle organizzazioni note. Insieme, le organizzazioni formano una "rete aziendale" privata e riservata ai soli membri. Una blockchain privata in una rete autorizzata ottiene il consenso attraverso un processo chiamato "approvazione selettiva", in cui utenti noti verificano le transazioni. Solo i membri con accesso e autorizzazioni speciali possono gestire il registro delle transazioni. Questo tipo di rete richiede più identità e controlli di accesso.
Quando si crea un'applicazione blockchain, è fondamentale valutare quale tipo di rete si adatta meglio ai propri obiettivi aziendali. Le reti private e autorizzate possono essere rigidamente controllate e sono da preferire per motivi di conformità e normativi. Tuttavia, le reti pubbliche e senza autorizzazione possono raggiungere una maggiore decentralizzazione e distribuzione.

```
Fonti:
https://www.ibm.com/it-it/topics/blockchain-security
```

10. 

... risposta ...
Sorveglianza di massa su mail e messaggi, cosa prevede il nuovo Regolamento Ue contro la pedopornografia online. Scorza (Privacy): "Avvertire gli utenti. Se qualcosa va storto conseguenze drammatiche"
Intervento di Guido Scorza, Componente del Garante per la protezione dei dati personali
(Il Fatto Quotidiano, 31 luglio 2021)
La sorveglianza di massa delle comunicazioni digitali diventa legale in Europa allo scopo di contrastare gli abusi sui minori online, il loro adescamento e la diffusione della pedopornografia. Questa la novità storica del nuovo Regolamento Ue ribattezzato "ChatControl" che il 6 luglio scorso ha già raccolto nel Parlamento Europeo un’ampia maggioranza (537 voti, 133 contrati e 24 astenuti) e si accinge a superare a breve l’ultimo scoglio legislativo, con la ratifica finale del Consiglio dell’Unione Europea. A quel punto il Regolamento sarà in vigore e di conseguenza, per tre anni, ogni cittadino europeo perderà il diritto alla riservatezza delle proprie comunicazioni digitali personali, sancito quasi vent’anni fa dalla Direttiva ePrivacy 2002/58/CE. "È un’attività significativa sul versante della protezione dei dati personali perché è molto invasiva, ma si tratta della migliore posizione di equilibrio sin qui identificata e, soprattutto, almeno per il momento, di una deroga", commenta parlando con ilfattoquotidiano.it Guido Scorza, avvocato e componente del collegio del Garante per la protezione dei dati personali. Che pure avverte: "Se qualcosa va storto, penso al rischio di falsi positivi, le conseguenze per le persone potrebbero essere drammatiche quanto lo è ritrovarsi bollato, in un qualche database pubblico o privato, come pedofilo mentre non lo si è".
Se fino ad oggi nessuno poteva sorvegliare o intercettare i messaggi e le comunicazioni personali di qualsiasi cittadino europeo senza il suo consenso o un’autorizzazione specifica dell’autorità giudiziaria, con l’entrata in vigore del Regolamento "ChatControl" i gestori dei servizi di comunicazione digitale – da Facebook a Google passando per le applicazioni di instant messaging come Whatsapp o Telegram – potranno accedere in automatico a tutte le nostre comunicazioni online e, se tra queste troveranno dei video, delle immagini o dei testi comparabili ad altri già identificati come pedopornografici o legati a forme di adescamento o abuso di minori, potranno prelevarli, segnalarli alle forze di polizia e cancellarli dalle loro piattaforme. Al momento restano comunque escluse dal Regolamento le comunicazioni crittografate, quindi i sistemi di intelligenza artificiale usati dalle app di instant messaging come Whatsapp o Telegram potranno intercettare i contenuti sospetti solo prima del loro invio e della loro ricezione, protette appunto con crittografia. Una condizione di riservatezza, questa che però potrebbe essere superata dal regolamento di follow up di ChatControl che alcuni analisti danno come imminente.
"Nessuno leggerà, o almeno dovrebbe leggere, in chiaro il contenuto delle nostre comunicazioni – chiarisce Scorza – I gestori scandaglieranno le nostre comunicazioni elettroniche in maniera automatica, attraverso filtri intelligenti che si limitano a cercare corrispondenza tra i contenuti multimediali che trasmettiamo e riceviamo e alcuni database che contengono contenuti di natura pedopornografica. È un’attività significativa sul versante della protezione dei dati personali perché è molto invasiva – aggiunge Scorza – ma si tratta della migliore posizione di equilibrio sin qui identificata e, soprattutto, almeno per il momento, di una deroga destinata a durare al massimo tre anni in vista dell’identificazione di una soluzione migliore".


Come in una galleria autostradale la crittografia end-to-end scherma e protegge il flusso al suo interno da un eventuale drone che riprende il traffico dall’alto, ma ciò non impedisce di recuperare le immagini delle automobili all’inizio in ingresso e, poi, in uscita.
Sicché è consigliabile e auspicabile, parlando di privacy e crittografia, proteggere il proprio device attraverso i servizi forniti dai produttori – e questo può valere per gli smartphone attivando la crittografia dalle impostazioni – ovvero attraverso appositi software per garantire il contenuto degli hard disk sui propri personal computer.

Per Meta e i sostenitori della privacy in tutto il mondo la questione è come sviluppare meccanismi per fermare gli abusi digitali prima che abbiano luogo, segnalando comportamenti potenzialmente sospetti senza accedere alle comunicazioni degli utenti, e creando meccanismi che consentano agli utenti di segnalare efficacemente un comportamento che possa rappresentare un abuso. Gli sforzi più recenti per trovare un punto di equilibrio sono stati accolti con intense critiche da parte dei sostenitori della privacy e della crittografia.Lo scorso agosto, per esempio, Apple aveva annunciato di voler introdurre una funzione in grado di scansionare localmente i dati sui dispositivi degli utenti alla ricerca di materiale pedo-pornografico. In questo modo, secondo la logica della società, Apple non avrebbe avuto bisogno di accedere direttamente ai dati per verificare l'eventuale presenza di materiale illecito. I ricercatori, però, hanno sollevato una serie di preoccupazioni, sottolineando come un meccanismo del genere sarebbe stato suscettibile di manipolazioni e abusi, oltre al rischio che l'obiettivo non venisse raggiunto nel caso in cui il sistema avesse prodotto una serie di falsi positivi e falsi negativi. Nel giro di un mese Apple ha fatto marcia indietro, dichiarando di avere bisogno di tempo per rivalutare il progetto.Nel suo rapporto, Bsr sostiene di non approvare i meccanismi di "scansione lato cliente", evidenziando come l'approccio finisca per condurre su un terreno scivoloso insostenibile. Bsr raccomanda invece che Meta persegua altre strategie, come la creazione di canali di segnalazione sicuri e reattivi per gli utenti e l'analisi dei metadati non criptati, per rilevare attività potenzialmente problematiche senza dovr scansionare o accedere direttamente alle comunicazioni.
```
Fonti:
https://www.garanteprivacy.it/home/docweb/-/docweb-display/docweb/9688789 ;
https://www.cybersecurity360.it/soluzioni-aziendali/privacy-e-crittografia-quadro-normativo-soluzioni-e-limiti-tecnologici/ ;
https://www.wired.it/article/privacy-rapporto-meta-crittografia-diritti-umani/ ;
```