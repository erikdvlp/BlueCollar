import React from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.css';
import './assets/css/index.css'
import HomeSplash from './components/HomeSplash';
import HomeNav from './components/HomeNav';
import HomeServices from './components/HomeServices';

ReactDOM.render(
	<React.StrictMode>
	<HomeNav />
	<HomeSplash />
	<HomeServices />
	</React.StrictMode>,
	document.getElementById('root')
);