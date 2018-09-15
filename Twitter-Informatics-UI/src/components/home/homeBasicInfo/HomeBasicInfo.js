import React, {PropTypes} from 'react';

const HomeBasicInfo = (props) => {
    return(
        <div className="sideInfo">
            <p className="maintext1">Welcome {props.profile.name} !!</p><br />
            <p className="maintext1 maintext2">Here's Some Basic Info About You</p>
            <table className="table table-hover mysidetable">
                <tbody className>
                    <tr>
                        <td>Screen name</td>&nbsp;<td>{props.profile.screenName}</td>
                    </tr>
                    <tr>
                        <td>Following</td>&nbsp;<td>{props.profile.friendsCount}</td>
                    </tr>
                    <tr>
                        <td>Followers</td>&nbsp;<td>{props.profile.followersCount}</td>
                    </tr>
                    <tr>
                        <td>Tweets</td>&nbsp;<td>{props.profile.statusesCount}</td>
                    </tr>
                    <tr>
                        <td>A/C created on</td>&nbsp;<td>{props.profile.createdDate.split('T',1)[0]}</td>
                    </tr>
                    <tr>
                        <td>#Fav. Tweets</td>&nbsp;<td>{props.profile.favoritesCount}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
};

HomeBasicInfo.propTypes = {
    profile: PropTypes.object.isRequired
};

export default HomeBasicInfo;