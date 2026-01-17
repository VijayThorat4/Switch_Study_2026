// @ts-check
import { defineConfig, devices } from '@playwright/test';
import { trace } from 'console';

const config = ({
  testDir: './tests',
  retries : 1,  // failed test cases will get re-executed once
  workers : 1,  // Serial Execution - all the tests will execute only on one env means only 1 browser will evoke
  timeout: 30 * 1000,
  reporter: 'html',
  export: {
    timeout: 5000
  },
  projects: [
    {
      name: 'chromeBrowser',
      use: {
        browserName: 'chromium',
        headless: false,
        viewport: { width: 720, height: 720 },  // opening browser in specific dimensions
        screenshot: 'on', // on, off, only-on-failure
        video: 'retain-on-failure',  // on, off, retain-on-failure, on-first-retry
        trace: 'on',//off,on
      },
    },
    {
      name: 'firefoxBrowser',
      use: {
        browserName: 'firefox',
        headless: false,
        screenshot: 'on',
        video: 'retain-on-failure',  // on, off, retain-on-failure, on-first-retry
        trace: 'on',//off,on
        ...devices['Galaxy S9+']  // opens the browser in same size as of this mobile decide screen size
      },
    }
  ]
});

module.exports = config