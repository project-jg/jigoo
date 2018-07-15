module.exports = {
  /*
  ** Headers of the page
  */
  head: {
    title: 'jigoo',
    meta: [
      {charset: 'utf-8'},
      {name: 'viewport', content: 'width=device-width, initial-scale=1'},
      {hid: 'description', name: 'description', content: 'Jiyun and Gyeongil&apos;s application'}
    ],
    link: [
      {rel: 'icon', type: 'image/x-icon', href: '/favicon.ico'}
    ],
  },

  modules : [
    '@nuxtjs/proxy'
  ],
  proxy: [
    // Proxies /foo to http://example.com/foo
    'http://localhost:8080/api'
  ],
  /*
  ** Customize the progress bar color
  */
  loading: {color: '#3B8070'},

  /*
  ** Build configuration
  */
  build: {
    /*
    ** Run ESLint on save
    */
    extend(config, {isDev, isClient}) {
      if (isDev && isClient) {
        config.module.rules.push({
          enforce: 'pre',
          test: /\.(js|vue)$/,
          loader: 'eslint-loader',
          exclude: /(node_modules)/
        })
      }
    }
  }
}
