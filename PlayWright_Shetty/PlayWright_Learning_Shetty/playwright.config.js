// @ts-check
import { defineConfig, devices } from '@playwright/test';
import { trace } from 'console';

const config = ({
  testDir: './tests',
  timeout: 30 * 1000,
  reporter: 'html',
  export: {
    timeout: 5000
  },
  use: {
    browserName : 'chromium',
    headless : false,
    screenshot : 'on',
    trace : 'on'

  },
});

module.exports = config