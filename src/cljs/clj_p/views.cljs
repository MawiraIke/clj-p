(ns clj-p.views
  (:require
    [re-frame.core :as re-frame]
    [re-com.core :as re-com]
    [clj-p.subs :as subs]
    ))

(defn title []
  (let [name (re-frame/subscribe [::subs/name])]
    [re-com/title
     :label (str "Hello from " @name)
     :level :level1]))

(defn navigation-bar
  []
  [:div#topnav {:class "topnav"}
   [:a {:class "active"
        :href  "#/home"} "Home"]
   [:a {:href "#/cv"} "CV"]
   [:a {:href "#/contact"} "Contact"]
   [:a {:href "#/about"} "About Me"]])

(defn image-section
  []
  [:img {:src "images/code.jpeg"
         :alt "Computer"}])

(defn text-overlay
  []
  [:div {:class "center-text"}
   [:p "Ike Mawira"]
   [:p "CS Student, Software Developer."]])

(defn space-add
  []
  [:div {:class "spacer"}
   [:p ""]])

(defn space-add-with-pdf
  []
  [:div {:class "spacer-with-pdf"}
   [:a {:class "resume-link"
        :href  "#/resume"} "Click here for resume as PDF"]])

(defn copyright
  []
  [:div {:class "copyright-contain"}
   [:p "Ike Mawira 2019"]])

(defn social-links
  []
  [:container {:class "row"}
   [:a {:class "col-md-1" :href "#/email"} "EMAIL"]
   [:a {:class "col-md-2" :href "#/linkedin"} "LINKEDIN"]
   [:a {:class "col-md-1" :href "#/github"} "GITHUB"]
   [:a {:class "col-md-3" :href "#/clojurians"} "CLOJURIANS ON SLACK"]
   [:a {:class "col-md-2" :href "#/stack-o"} "STACK OVERFLOW"]
   [:a {:class "col-md-1" :href "#/twitter"} "TWITTER"]
   [:a {:class "col-md-2" :href "#/coffee"} "BUY ME A COFFEE"]])

(defn main-panel []
  [:div
   [navigation-bar]
   [:div {:class "contain"}
    [image-section]
    [text-overlay]]
   ;; leave this here cause there is some undesirable space after the image if this is not here
   [re-com/v-box
    :width "100%"
    :children [[space-add]]]
   [space-add-with-pdf]
   [:footer {:class "footer-c"}
    [copyright]
    [social-links]]])
