##Bank accounts managing project

Dorim sa cream conturi bancare pentru clientii unei banci , in functie de tipul pe care il aleg: cont curent, depozit la termen 
si cont de economii. Stim ca toate cele trei conturi au o suma, in functie de care calculeaza o posibila dobanda si un tip, in 
functie de care se stabileste o limita de retrageri de numerar.

Design pattern-ul Factory are ca scop crearea obiectelor dupa o interfata comuna, in cazul nostru aceasta fiind BankAccount, in
care  definim modul de calcul al caracteristicilor contului bancar (dobanda, limita de retrageri), produsele concrete sunt reprezentate
de CurrentAccount, DepositAccount si SavingsAccount, iar clasa BankAccountFactory este cea care returneaza obiecte noi, in functie de  
tipul de cont pe care il alegem. Am ales sa folosesc acest design pattern, pentru ca, desi cele trei clase care definesc tipurile de 
conturi au metode comune, acestea sunt implementate diferit. 
