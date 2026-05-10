# TP7 - Validations avancées et détection des conflits

## Objectif

Ajouter des mécanismes de validation avancée dans IPPlan-Manager afin de détecter les incohérences dans un plan d’adressage IP et renforcer la robustesse du système.


## Notions étudiées

- Exceptions personnalisées en Java  
- Utilisation de `throw`  
- Gestion des erreurs avec `try/catch`  
- Validation des adresses IP  
- Détection de chevauchement de réseaux  
- Détection de conflits VLAN  
- Robustesse logicielle  
- Séparation logique métier / validation  


## Scénarios testés

### 1. Génération normale d’un plan VLSM
- Besoins réseau valides (ADMIN, TECHNIQUE, WIFI, SERVEURS)
- Génération automatique des sous-réseaux
- Aucune erreur détectée


### 2. Validation des adresses IP
- Vérification du format IP généré
- Détection des adresses invalides (cas volontaire ou erreur)


### 3. Détection de chevauchement réseau
- Comparaison de plusieurs sous-réseaux générés
- Vérification des plages d’adresses
- Détection automatique des overlaps


### 4. Test de conflit VLAN
- Création de VLAN avec identifiants uniques
- Ajout volontaire d’un VLAN avec ID déjà utilisé
- Déclenchement d’une exception `ConflitVLANException`

## Résultats obtenus

- Le moteur VLSM génère correctement les sous-réseaux
- Le validateur détecte les incohérences réseau
- Les VLANs sont correctement créés et associés
- Les conflits VLAN sont bloqués automatiquement
- Les erreurs sont gérées sans crash du programme

## Difficultés rencontrées

- Compréhension des chevauchements réseau (calculs de plages IP)
- Gestion des conversions IP ↔ entier pour les comparaisons
- Implémentation correcte des exceptions personnalisées
- Coordination entre moteur VLSM et validateur
- Gestion des cas d’erreurs sans interrompre l’application


## Réponses aux questions

1. Les validations avancées garantissent la cohérence d’un plan IP et évitent les conflits réseau en production.  

2. Une erreur est un problème logique ou de saisie, une exception est un mécanisme Java pour la gérer proprement.  

3. Les exceptions personnalisées permettent de rendre les erreurs plus claires et adaptées au domaine réseau.  

4. Le bloc `try/catch` permet d’exécuter du code tout en capturant les erreurs sans arrêter le programme.  

5. Deux VLANs ne doivent pas partager le même ID pour éviter les conflits de segmentation réseau.  

6. Deux sous-réseaux ne doivent pas se chevaucher car cela provoque des conflits d’adressage IP.  

7. La conversion en entier permet de comparer facilement des plages IP mathématiquement.  

8. La séparation permet de rendre le code plus propre, maintenable et professionnel (architecture modulaire).  


## Conclusion

Ce TP introduit la validation avancée dans IPPlan-Manager.  
L’application devient plus robuste, capable de détecter des erreurs réseau critiques et de garantir la cohérence des plans d’adressage.