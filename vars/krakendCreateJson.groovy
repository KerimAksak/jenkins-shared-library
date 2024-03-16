def call(Map config=[:]) {
  sh "FC_ENABLE=1 \
    FC_SETTINGS='${config.workingDir}/settings' \
    FC_PARTIALS='${config.workingDir}/partials' \
    FC_TEMPLATES='${config.workingDir}/templates' \
    FC_OUT=krakend.json \
    krakend check -t -d -c './${config.flexibleFileName}'"
}