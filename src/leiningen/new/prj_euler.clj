(ns leiningen.new.prj-euler
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "prj-euler"))

(defn prj-euler
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' prj-euler project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
