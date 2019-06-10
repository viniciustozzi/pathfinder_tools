(ns pathfinder-tools.components.sheet)

(defn- ability-values
  [name]
  [:div.columns
   [:div.column name]
   [:div.column name]
   [:div.column name]
   [:div.column name]])

(defn sheet
  []
  [:div
   ;;2(ui/title "Character Sheet")
   (ability-values "STR")])
