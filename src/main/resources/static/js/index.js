Vue.component('btn', {
    template: '<md-button class="md-raised md-primary">Primary</md-button>'
})

Vue.component('inp', {
    props:'',
    template: '    <md-field>\n' +
    '      <label>Type here!</label>\n' +
    '      <md-input v-model="message"></md-input>\n' +
    '    </md-field>'
})

Vue.use(VueMaterial.default)

new Vue({
    el: '#app',
    data:{
        message: 'Vasia'
    }
})

