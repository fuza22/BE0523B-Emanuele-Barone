select * from public.clienti;

select * from public.clienti where nome = 'Mario';

select nome, cognome from public.clienti where extract (year from anno_di_nascita) = 1982;

select * from public.fatture;

select * from public.fornitori;

select * from public.fatture where iva = 20;

select * from public.prodotti;

select * from public.prodotti where extract (year from data_attivazione) = 2017 and in_produzione = true or in_commercio = true;

select * from public.fatture inner join public.clienti on id_cliente = numero_cliente where importo < 1000;

select numero_fattura, importo, iva, data_fattura, denominazione from public.fatture inner join public.fornitori on fatture.numero_fornitore = fornitori.numero_fornitore;

select data_fattura, count (*) from public.fatture where iva = 20 group by data_fattura;

select extract(year from data_fattura),data_fattura, count(numero_fattura), sum(importo) from public.fatture where iva = 20 group by data_fattura;


