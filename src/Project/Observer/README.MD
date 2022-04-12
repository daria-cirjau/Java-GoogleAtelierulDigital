<h1>Shops managing project</h1>

O firma romaneasca are magazine in mai multe tari, si isi doreste ca pretul unui produs sa se modifice in functie de schimbarile costului
de productie din tara de provenienta. Astfel, dorim ca toate magazinele, din toate tarile in care se regasesc, sa fie notificate atunci
cand intervine o schimbare de pret a produsului in Romania.

Design pattern-ul Observer este un model behavioral si defineste relatia in care un subiect notifica mai multi observatori. In cazul nostru,
Observer este interfata care defineste obiectele care vor fi notificate, observatorii concreti sunt reprezentati de magazinele din Romania, 
China, SUA, UK si din restul Europei, iar clasa Subject contine si gestioneaza lista de observatori si ii notifica atunci cand intervin modificari.
