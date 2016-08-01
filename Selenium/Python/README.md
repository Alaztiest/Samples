## Selenium Code Samples Using Python

This code samples shows how to use Python and Unittest testing framework in order to write tests.
Python is easy to learn and has a readable syntax and recommended to writing your tests with. 

**Downloads:**
- Download selenium using pip install or easy_install: 

```python
pip install selenium 
```

```python
easy_install install selenium 
```

- Using Eclipse IDE is recommended, Python plugins can be found at the [marketplace](https://marketplace.eclipse.org).
- Perfecto integration with eclipse plugin can be downloaded from [here](https://www.perfectomobile.com/download-integrations) .

###Easy starting:

Setting up a WebDriver:
```python
from selenium import webdriver 

#Your Perfecto Lab host name.
host = 'MY_HOST.perfectomobile.com'

#Set your desired capabilities :
capabilities = {
          'platformName'      : 'My_platformName',
          'platformVersion'   : 'My_platformVersion',
          'browserName'       : 'My_browserName',
          'browserVersion'    : 'My_browserVersion',
          'user'              : "MY_USER",
          'password'          : "MY_PASSWORD"
          }

driver = webdriver.Remote('https://' + host + '/nexperience/perfectomobile/wd/hub' , capabilities)
```


