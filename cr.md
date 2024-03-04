Questions:

2.1) Quand on est dans le mode create on cree quand meme les colonnes sans meme de preciser @Column parce que on est dans le mode "create" donc on est pas obliger de preciser.

2.2) Les effets des propriétés ajoutées dans les @Column sont : pour l'attribut "testName" ca montre l'unicite de l'attribut. Pour "jpaSeed" ca montre qu'on prend un seul nombre apres la virgule. Pour "savedAt" elle a aucun effect parce qu'on a pas rajouter une propriété

2.3) Il faut les annotations @Column dans les cas suivants: on est dans le mode "validate" et si on est dans le mode "create/ create-drop" on est oblige de le rajouter si on veut rajouter des propriétés a la colonne.