import React from 'react';

const tagline = "They work hard. So you don't have to.";
const desc = "BlueCollar connects capable, hands-on professionals with the rest of us.";

class HomeSplash extends React.Component
{
	render()
	{
		return (
			<div class="homeSplash">
				<h2>{tagline}</h2>
				<p>{desc}</p>
				<button class="btn btn-primary" type="button">Get started</button>
			</div>
		);
	}
}

export default HomeSplash;