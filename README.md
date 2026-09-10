<h1>Product Catalog app</h1>

<h3>Here I will write tech stack decisions </h3>
<p> <b>UI toolkit: </b> Jetpack Compose</p>
<p><b>Why: </b> because it is modern and declarative Google's standard Android UI, and it pairs naturally with a reactive ViewModel (StateFlow->collectAsState)</p>
<br><br>
<p> <b>Architecture: </b> MVVM</p>
<p><b>Why: </b> Recommended by Google's Android Architecture Guidelines. Cleanly separates what the UI shows (View/Composable) from how state is derived (ViewModel) from where data comes from (Model = Repository + Remote data source). And aslo it is easy to test.</p> 
<br><br>
<p> <b>Networking: </b> Retrofit+OkHttp</p>
<p><b>Why: </b>Industry-standard HTTP client for Android. Built-in coroutine suspend fun support, easy to add logging/interceptors.</p> 
<br><br>