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

;;(defn navigation-bar
;;  []
;;  [:div#topnav {:class "topnav"}
;;   [:a {:class "active"
;;        :href  "#/home"} "Home"]
;;   [:a {:href "#/cv"} "CV"]
;;   [:a {:href "#/contact"} "Contact"]
;;   [:a {:href "#/about"} "About Me"]])

;; Bootstrap navigation bar, needs formatting
(defn navigation-bar
  []
  [:nav {:class "navbar navbar-expand-lg navbar-dark bg-dark"}
   [:a {:class "navbar-brand" :href "/#"} "Home"]
   [:button {:class         "navbar-toggler"
             :type          "button"
             :data-toggle   "collapse"
             :data-target   "#navbarNav"
             :aria-controls "navbarNav"
             :aria-expanded "false"
             :aria-label    "Toggle navigation"} [:span {:class "navbar-toggler-icon"}]]
   [:div {:class "collapse navbar-collapse"
          :id    "navbarNav"}
    [:ul {:class "navbar-nav my-2 my-lg-0"}
     ;;[:li {:class "nav-item active"}
     ;; [:a {:class "nav-link" :href "/#"} "Home" [:span {:class "sr-only"} "(current)"]]]
     ;;[:li {:class "nav-item"}
     ;; [:a {:class "nav-link" :href "/#spacerr"} "CV"]]
     ]]])

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
  [:div {:class "spacer-with-pdf"
         :id "spacerr"}
   [:a {:class "resume-link"
        :href  "/docs/resume.pdf"} "Click here for resume as PDF"]])

(defn minor-space
  []
  [:div {:class "minor-space"}])

(defn copyright
  []
  [:div {:class "copyright-contain"}
   [:p "Ike Mawira 2019"]])

(defn social-links
  []
  [:container {:class "row"}
   [:a {:class "col-md-2" :href "mailto:mawiraike@gmail.com"} "EMAIL"]
   [:a {:class "col-md-2" :href "https://www.linkedin.com/in/ike-mawira-706974163"} "LINKEDIN"]
   [:a {:class "col-md-2" :href "https://github.com/MawiraIke"} "GITHUB"]
   [:a {:class "col-md-2" :href "https://stackoverflow.com/users/10081740/ike-mawira"} "STACK OVERFLOW"]
   [:a {:class "col-md-2" :href "https://twitter.com/ike__dev"} "TWITTER"]
   [:a {:class "col-md-2" :href "https://www.buymeacoffee.com/ikeM"} "BUY ME A COFFEE"]])

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
    [minor-space]
    [copyright]
    [social-links]
    [minor-space]]])
