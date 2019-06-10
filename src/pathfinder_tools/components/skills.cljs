(ns pathfinder-tools.components.skills)

(defn- skill-set
  ([skill-name source]
   (skill-set skill-name source false))
  ([skill-name source has-skill-detail]
   [:tr
    [:td [:input {:type "checkbox"}]]
    [:td skill-name " " (if has-skill-detail [:input])]
    [:td [:input]]
    [:td "= " source]
    [:td [:input]]
    [:td "+"]
    [:td [:input]]
    [:td "+"]
    [:td [:input]]]))

(defn skills
  []
  [:table.table
   [:thead
    [:tr
     [:th]
     [:th "Skill Name"]
     [:th "Total Bonus"]
     [:th]
     [:th "Ability Mod"]
     [:th]
     [:th "Ranks"]
     [:th]
     [:th "Misc. Mod."]]]
   [:tbody
    (skill-set "Acrobatics" "Dex")
    (skill-set "Appraise" "Int")
    (skill-set "Bluff" "Cha")
    (skill-set "Climb" "Str")
    (skill-set "Craft" "Int" true)
    (skill-set "Craft" "Int" true)
    (skill-set "Craft" "Int" true)
    (skill-set "Diplomacy" "Cha")
    (skill-set "Disable Device" "Dex")
    (skill-set "Disguise" "Cha")
    (skill-set "Escape Artist" "Dex")
    (skill-set "Fly" "Dex")
    (skill-set "Handle Animal" "Cha")
    (skill-set "Heal" "Wis")
    (skill-set "Intimidate" "Cha")
    (skill-set "Knowledge (Arcana)" "Int")
    (skill-set "Knowledge (Dungeoneering)" "Int")
    (skill-set "Knowledge (Engeneering)" "Int")
    (skill-set "Knowledge (Geography)" "Int")
    (skill-set "Knowledge (History)" "Int")
    (skill-set "Knowledge (Local)" "Int")
    (skill-set "Knowledge (Nature)" "Int")
    (skill-set "Knowledge (Nobility)" "Int")
    (skill-set "Knowledge (Planes)" "Int")
    (skill-set "Knowledge (Religion)" "Int")
    (skill-set "Linguistics" "Int")
    (skill-set "Perception" "Wis")
    (skill-set "Perform" "Cha" true)
    (skill-set "Perform" "Cha" true)
    (skill-set "Profession" "Wis" true)
    (skill-set "Profession" "Wis" true)
    (skill-set "Ride" "Wis")
    (skill-set "Sense Motive" "Wis")
    (skill-set "Sleight of Hand" "Dex")
    (skill-set "Spellcraft" "int")
    (skill-set "Stealth" "Dex")
    (skill-set "Survival" "Wis")
    (skill-set "Swim" "Str")
    (skill-set "Use Magic Device" "Cha")
    (skill-set "Acrobatics" "Dex")
    (skill-set "Acrobatics" "Dex")
    (skill-set "Acrobatics" "Dex")]])