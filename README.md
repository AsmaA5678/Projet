🚀 Projet de Conteneurisation des Applications 🎯
🌟 Introduction
Bienvenue dans ce projet de conteneurisation d'une application web de gestion des notes d'examen ! 🎓
Nous avons utilisé Docker pour conteneuriser l'application, puis déployé celle-ci sur un cluster Kubernetes. L'application comprend un frontend développé avec React.js, un backend avec Spring Boot, et une base de données PostgreSQL pour la gestion des données. 📊

🎯 Objectifs du Projet
🐳 Conteneuriser l'application avec Docker.
🚀 Déployer l'application sur Kubernetes avec des fichiers YAML.
🧑‍💻 Gérer les ressources du cluster Kubernetes (quotas CPU et mémoire, contrôle d'accès, etc.).
💡 Assurer la haute disponibilité avec des probes Liveness, Readiness, et Startup.
🌍 Accéder à l'application via un Ingress configuré.
🛠️ Outils et Technologies Utilisées
Docker: Conteneurisation des applications (frontend, backend, base de données).
Kubernetes: Orchestration des conteneurs et gestion de la scalabilité.
Minikube: Cluster Kubernetes local.
PostgreSQL: Base de données pour stocker les informations des étudiants et leurs notes.
React.js: Développement du frontend.
Spring Boot: Framework utilisé pour le backend Java.
📊 Gestion des Ressources et de la Disponibilité
Ressources (Quota)
Les quotas sont définis dans le fichier resource-quota.yml pour limiter la consommation de ressources CPU et mémoire des pods. Cela permet d'assurer une utilisation optimale des ressources du cluster. ⚙️

RBAC (Contrôle d'Accès)
Le contrôle d'accès est géré via les rôles RBAC définis dans le fichier rbac.yml. Ce fichier permet de définir les permissions d'accès aux ressources dans le namespace "exam". 🔑

Disruption Budget
Un budget de perturbation (Disruption Budget) est défini pour assurer que l'application reste disponible même pendant des opérations de maintenance ou des pannes. 💪

Probes (Liveness, Readiness, Startup)
Ces probes sont utilisées pour surveiller l'état de santé des pods. Les probes liveness et readiness garantissent que les pods fonctionnent correctement, et la probe startup est utilisée pour vérifier si l'application démarre correctement. 🚨
📝 Conclusion
Ce projet a permis de conteneuriser et de déployer une application web de gestion des notes d'examen avec Docker et Kubernetes. Nous avons utilisé Minikube pour le déploiement local et configuré l'accès à l'application via un nom de domaine local. Grâce à Kubernetes, nous avons mis en place une architecture robuste, évolutive et disponible, en appliquant les bonnes pratiques de gestion des ressources et de sécurité.

🎉 Merci de lire ! 
