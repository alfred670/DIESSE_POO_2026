Voici un contenu propre et complet que tu peux copier directement dans ton `README.md` du TP2.


# TP2 - Encapsulation et validation des données réseau

## Objectif

Ce TP a pour objectif d’améliorer la conception du projet IPPlan-Manager en introduisant l’encapsulation et la validation des données afin de sécuriser les objets du système réseau.


## Notions étudiées

* Encapsulation (private)
* Getters et setters
* Validation des données
* Mot-clé `this`
* Construction d’objets sécurisés
* Robustesse d’un système orienté objet


## Description du TP

Dans ce TP, les classes du système réseau ont été améliorées afin d’éviter les accès directs aux attributs et garantir la cohérence des données :

* Une adresse IP ne peut pas être vide ou invalide
* Un réseau ne peut pas avoir de masque CIDR invalide
* Une interface réseau doit être correctement initialisée
* Un équipement doit toujours avoir un nom et un type valides


## Tests réalisés

* Création d’adresses IP valides et invalides
* Test de validation des champs vides ou null
* Test des masques CIDR hors plage (ex : 55)
* Activation et désactivation d’interfaces réseau
* Création d’équipements incomplets pour tester les corrections automatiques


## Résultats obtenus

Les validations permettent désormais :

* d’éviter les valeurs incohérentes
* de remplacer automatiquement les données invalides
* d’assurer la stabilité des objets réseau


## Difficultés rencontrées

* Compréhension de l’encapsulation et des modificateurs d’accès
* Mise en place des validations dans les setters
* Organisation du projet NetBeans
* Gestion du dépôt Git et structure des dossiers


## Réponses aux questions

1. `private` permet de protéger les attributs et empêcher l’accès direct.
2. Un attribut public est accessible partout, un attribut privé est protégé.
3. Les getters et setters permettent de contrôler l’accès aux données.
4. Les validations évitent les erreurs et incohérences dans les réseaux.
5. `this` fait référence à l’objet courant.
6. Le constructeur utilise les setters pour appliquer les validations.
7. Le masque CIDR doit être compris entre 0 et 32 pour être valide.
8. L’encapsulation améliore la sécurité et la fiabilité du logiciel.


## Conclusion

Ce TP permet de comprendre l’importance de l’encapsulation dans la conception d’un système réseau fiable et robuste.
