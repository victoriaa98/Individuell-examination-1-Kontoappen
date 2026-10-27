### Individuell-examination-1-Kontoappen

## Datasäkerhet/Inkapsling: Hur har du skyddat kontots uppgifter i din kod, och vad hade kunnat hända om du inte gjorde det?


Jag skyddar kontots uppgifter genom att använda private på fälten i Account. Koden utanför klassen kan läsa uppgifterna genom metoder, men inte ändra dem direkt. Utan det skyddet skulle reglerna för till exempel uttag kunna kringgås.


## Skapande-mönster (Factory): Varför skapas kontot via registrets metod istället för direkt ute i Main?

Jag låter registret skapa kontot eftersom registret också ska hantera alla konton. Då behöver Main bara ta emot användarens uppgifter och skicka dem till registret. Det blir enklare att hålla ordning på kontot.


## Flöde: Beskriv ett av menyvalen steg för steg (vad användaren matar in → vilket objekt som hanterar det → vilken metod som körs → vad som skrivs ut).

Om användaren väljer menyvalet 3, som är att sätta in pengar. Användaren skriver ägarens namn och anger ett belopp. Main använder findAccount i registret för att hitta kontot och ropar sedan deposit på kontot. Kontot ändrar saldot och skriver ut om insättningen gick igenom.


## Reflektion (3–5 meningar): Hur gjorde du när du körde fast eller stötte på ett problem? Om du använde verktyg som AI, Google eller kursmaterial: ge ett konkret exempel på hur du tog hjälp för att förstå och lösa problemet själv.

När jag körde fast försökte jag först läsa felmeddelandet och ta reda på vilken del av koden det gällde. Jag arbetade med en del i taget och testade programmet efter varje ändring. När jag inte förstod hur jag skulle hantera felaktig inmatning tog jag hjälp av kursmaterialet och jämförde med ett enklare exempel. Sedan skrev jag om lösningen så att jag kunde förklara hur den fungerade. Hela tiden ville jag förstå vad jag faktiskt gjorde, precis som i veckouppgifterna så ville jag testa mig själv, det gjorde jag genom att högt förklara koden. 

Jag fick problem när jag skulle anropa metoder från andra klasser, eftersom jag var osäker på hur objekten och metoderna skulle kopplas ihop. Men då använde jag mig av AI för att få förslag på hur man kan kontrollera och hur allt hör ihop genom hela programmet. Jag har även använt mig av boken “Let us Java” skriven av Yashavant Kanetkar som hjälpt mig mycket med grunderna. Så stegvis har jag förstått hur klasserna samarbetar med varandra.

