const song = {
    name: 'Dying to live',
    artist: 'Tupac',
    featuring: 'Biggie Smalls'
    };

const fun = ()=>{
    const markup=`
    <div class="song">
       <p>${song.name}-${song.artist}
       <br>
       (Featuring ${song.featuring})</p>
    </div>
    `;
    document.body.innerHTML = markup;

}

export{fun};
