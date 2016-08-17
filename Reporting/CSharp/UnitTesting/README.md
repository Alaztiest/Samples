## UnitTesting

The project demonstrates adding reportium client using [Reporting SDK for C#](https://www.nuget.org/packages/Perfecto-Reporting) to your UnitTesting tests.

The project uses standard template from Perfecto [plugin for Visual Studio](https://www.perfectomobile.com/integrations/continuous-quality-integrated-visual-studio).

There's two tests included in this project one which should *succeed* and one which should *fail* in order to show
reporting functionality.

The first test navigating to google and searching for PerfectoCode repo at GitHub.<br/>
Then clicks on the first search result and assert that the Keyword *Perfecto* is in the title of the page.

The second test *Assert fail* immediately using CSharp assertion. 

**TODO:**
- Make sure you have installed Perfecto [plugin for Visual Studio](https://www.perfectomobile.com/integrations/continuous-quality-integrated-visual-studio) and [Reporting SDK for C#](https://www.nuget.org/packages/Perfecto-Reporting).
- Download the project and import the .sln file to Visual Studio IDE.
- Set your Perfecto lab User, Password and Host at under *TestClass* annotation.
```Csharp
const string PERFECTO_USER = "MY_USER";
const string PERFECTO_PASS = "MY_PASS";
const string PERFECTO_HOST = "MY_HOST.perfectomobile.com";
``` 
- Run the tests as UnitTesting tests with right click on the file and then run tests.

After the run finished it will print the report URL at the test output.<br/>
The following line will automatically open the URL in your default browser:
``` Csharp
//Optional open browser after test finished : 
System.Diagnostics.Process.Start(url.ToString());
``` 