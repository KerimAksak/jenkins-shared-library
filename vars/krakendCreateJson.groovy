def call(Map config=[:]) {
  sh "FC_ENABLE=1 \        
    FC_SETTINGS='$PWD/settings' \
    FC_PARTIALS='$PWD/partials' \
    FC_TEMPLATES='$PWD/templates' \
    FC_OUT=krakend.json \
    krakend check -t -d -c '$PWD/${config.flexibleFileName}'"
}