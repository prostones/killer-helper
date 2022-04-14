import {defineConfig} from 'vite'
import vue from '@vitejs/plugin-vue';
import styleImport, {VantResolve} from 'vite-plugin-style-import';

const {resolve} = require('path') //必须要引入resolve

export default defineConfig({
    plugins: [
        vue(),
        styleImport({
            resolves: [VantResolve()],
        }),
    ],
    resolve: {
        alias: {
      '@': resolve(__dirname, 'src')
    }
  },
  css: {
    preprocessorOptions: {
      less: {
        charset: false,
        additionalData: '@import "./src/style/global.less";' // 加载全局样式，使用less特性
      }
    }
  },
  server: {
    host: "0.0.0.0",
    proxy: {
      '/api': {
          target: 'http://localhost:8080',
          changeOrigin: true,
          rewrite: (path) => path.replace(/^\/api/, '')
      }
    }
  }
});
