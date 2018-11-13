# one-two-three
projectje met allerlei unit tests, integratie tests, REST assured tests, ...

## Checklist nieuwe applicatie

- [x] Archetype aangemaakt via https://start.spring.io/
- [x] Git aangemaakt op https://github.com/jonasdevries  
- [ ] Pipeline aanmaken
- [ ] Database schema's aanmaken
- [ ] Interne front-ends aanpassen
- [ ] Test users aanmaken
- [ ] Technische fiche aanmaken
- [ ] Verwijder deze checklist

## Links
https://docs.spring.io/spring-boot/docs/current/reference/html/index.html
http://joel-costigliola.github.io/assertj/assertj-core-quick-start.html

## Local development

### Frontend
```
npm install @angular/cli -g
cd -frontend
npm install
npm start
```
De applicatie is beschikbaar op [http://localhost:4200](http://localhost:4200).

### Backend
Run de klasse `Application` vanuit de IDE of volgende vanuit cmd:
```
cd -service
mvn spring-boot:run
```
De applicatie is beschikbaar op [http://localhost:8080/???]